package com.mybatisdynamicsql.pojo;

import java.util.List;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-31 18:41
 */
public class Dept {
	private Integer did;
	private String deptName;
	private List<Emp> emps;

	public Dept() {
	}

	public Integer getDid() {
		return did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	public List<Emp> getEmps() {
		return emps;
	}
	
	public void setEmps(List<Emp> emps) {
		this.emps = emps;
	}
	
	@Override
	public String toString() {
		return "Dept{" +
					   "did=" + did +
					   ", deptName='" + deptName + '\'' +
					   ", emps=" + emps +
					   '}';
	}
}
