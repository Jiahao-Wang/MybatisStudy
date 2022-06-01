package com.mybatiscustmapping.pojo;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-31 18:41
 */
public class Dept {
	private Integer did;
	private String deptName;

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

	@Override
	public String toString() {
		return "Dept{" +
				"did=" + did +
				", deptName='" + deptName + '\'' +
				'}';
	}
}
