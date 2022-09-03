package controller.repository;

import java.util.List;
import java.util.Optional;

import model.Model;

public interface Repository<MODEL extends Model, PRIMARY_FIELD> {
	public List<MODEL> getAll();

	public Optional<MODEL> getByPrimaryField(PRIMARY_FIELD primaryField);

	public void delete(MODEL itemToDelete);

	public void save(MODEL itemToSave);
}
