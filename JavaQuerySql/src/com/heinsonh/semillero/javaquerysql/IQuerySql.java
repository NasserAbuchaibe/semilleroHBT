package com.heinsonh.semillero.javaquerysql;

import java.util.List;

/**
 * Interface con el metodo IQuerySql, que sera reescrito
 * paara generar los diferentes tipos de consulta.
 * @author Windows 10
 *
 */

public interface IQuerySql {
	public List<String> getQuery();
}
