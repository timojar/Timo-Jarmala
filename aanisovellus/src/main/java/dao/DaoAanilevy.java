package dao;

import java.util.List;

import bean.Aanilevy;

public interface DaoAanilevy {
	
	
abstract void talleta(Aanilevy aanilevy);

abstract Aanilevy etsi(int id);


abstract List<Aanilevy> haeKaikki();

}
