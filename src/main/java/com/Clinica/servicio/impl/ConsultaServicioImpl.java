package com.Clinica.servicio.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Clinica.dto.ConsultaFechaDTO;
import com.Clinica.modelo.Analitica;
import com.Clinica.modelo.Consulta;
import com.Clinica.repo.IConsulta;
import com.Clinica.repo.IConsultaExamen;
import com.Clinica.repo.IGenericRepo;
import com.Clinica.servicio.IConsultaService;

import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Service
public class ConsultaServicioImpl extends CRUDImp<Consulta, Integer> implements IConsultaService {
	
	@Autowired
    private IConsulta repo;
	
    @Autowired
    private IConsultaExamen ceRepo;
	
	@Override
    protected IGenericRepo<Consulta, Integer> getRepo() {
        // TODO Auto-generated method stub
        return repo;
    }
	
	@Transactional
    @Override
    public Consulta registrarTransaccional(Consulta consulta, List<Analitica> analiticas) throws Exception {

        //Guarda la referencia de la consulta
        consulta.getDetalleConsulta().forEach(det -> det.setConsulta(consulta));
 
        /*
         * for(DetalleConsulta det : consulta.getDetalleConsulta()) {
         * det.setConsulta(consulta); }
         */
 
        repo.save(consulta);
 
        analiticas.forEach(ex -> ceRepo.registrar(consulta.getIdConsulta(), ex.getIdAnalitica()));
 
        return consulta;
    }
    
	@Override
    public List<ConsultaFechaDTO> listarResumen() {
        // TODO Auto-generated method stub
        List<ConsultaFechaDTO> consultas = new ArrayList<>();
        repo.getConsultas().forEach(x -> {
            ConsultaFechaDTO cr = new ConsultaFechaDTO();
            cr.setCantidad(Integer.parseInt(String.valueOf(x[1])));
            cr.setFecha(String.valueOf(x[0]));
            consultas.add(cr);
        });
        return consultas;
    }
    
    @Override
    public byte[] generarReporte() {
        // TODO Auto-generated method stub
        byte[] data = null;
        Map<String, Object> parametros = new HashMap<>();
        parametros.put("txt_titulo", "Resumen Consulta por fecha");
        File file;
        try {
            file = new ClassPathResource("/informes/consultas.jasper").getFile();
            JasperPrint print = JasperFillManager.fillReport(file.getPath(), parametros,
                    new JRBeanCollectionDataSource(listarResumen()));
            data = JasperExportManager.exportReportToPdf(print);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }

}
