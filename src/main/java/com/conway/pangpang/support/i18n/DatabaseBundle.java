package com.conway.pangpang.support.i18n;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.util.StringUtils;

public class DatabaseBundle {

	private String resourceTable;
	
	private String codeColumn;
	
	private String dataColumn;
	
	private String localeColumn;
	
	private DataSource dataSource;
	
	public static final String DEFAULT_RESOURCE_TABLE = "RESOURCE";
	
	public static final String DEFAULT_CODE_COLUMN = "CODE";
	
	public static final String DEFAULT_DATA_COLUMN = "MESSAGE";
	
	public static final String DEFALUT_LOCALE_COLUMN = "LOCALE_ID";
	
	public Map<Locale, String> getString(String code){
		return null;
	
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public String getResourceTable() {
		return resourceTable != null? resourceTable : DEFAULT_RESOURCE_TABLE;
	}

	public void setResourceTable(String resourceTable) {
		this.resourceTable = resourceTable;
	}
	
	public String getCodeColumn() {
		return codeColumn != null? codeColumn : DEFAULT_CODE_COLUMN;
	}

	public void setCodeColumn(String codeColumn) {
		this.codeColumn = codeColumn;
	}

	public String getDataColumn() {
		return dataColumn != null?dataColumn : DEFAULT_DATA_COLUMN;
	}

	public void setDataColumn(String dataColumn) {
		this.dataColumn = dataColumn;
	}

	public String getLocaleColumn() {
		return localeColumn != null ? localeColumn : DEFALUT_LOCALE_COLUMN;
	}

	public void setLocaleColumn(String localeColumn) {
		this.localeColumn = localeColumn;
	}

	private class DatabaseExecutor extends JdbcDaoSupport{
		
		public DatabaseExecutor(){
			super.setDataSource(dataSource);
		}
	
		public List<Map<String, Object>> executeResourceQuery(String code){
		
			return super.getJdbcTemplate().queryForList(buildSelectSQL(code));
		}
		
		public String buildSelectSQL(String code){
			
			StringBuilder sql = new StringBuilder();
			sql.append("select ");
			sql.append(getCodeColumn()).append(",");
			sql.append(getLocaleColumn()).append(",");
			sql.append(getDataColumn()).append(" ");
			sql.append("from ").append(getResourceTable()).append(" ");
			sql.append("where ");
			sql.append(getCodeColumn()).append(" = ");
			sql.append("'").append(code).append("'");
				
			return sql.toString();
			
		}
	}
}
