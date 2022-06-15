package com.Clinica.servicio.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public abstract class CRUDImp<T,ID>{
	
	@SuppressWarnings("hiding")
	protected abstract <T,ID> JpaRepository<T, ID> getRepo();

	public T registrar(T t) throws Exception {
		return getRepo().save(t);
	}

	public T modificar(T t) throws Exception {
		return getRepo().save(t);
	}

	public List listar() throws Exception {
		return getRepo().findAll();
	}

	public T listarPorId(ID id) throws Exception {
		@SuppressWarnings("unchecked")
		Optional<T> m1 = (Optional<T>) getRepo().findById(id);
		return m1.isPresent() ? m1.get() : null;
	}

	public void eliminar(ID id) throws Exception {
		getRepo().deleteById(id);
	}

}
