package com.springcore.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {

	private String empName;
	private List<String> devices;
	private Set<Long> phoneNo;
	private Map<String, String> course;
	private Properties props;

	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}

	/**
	 * @return the props
	 */
	public Properties getProps() {
		return props;
	}

	/**
	 * @param props the props to set
	 */
	public void setProps(Properties props) {
		this.props = props;
	}

	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	/**
	 * @return the devices
	 */
	public List<String> getDevices() {
		return devices;
	}

	/**
	 * @param devices the devices to set
	 */
	public void setDevices(List<String> devices) {
		this.devices = devices;
	}

	/**
	 * @return the phoneNo
	 */
	public Set<Long> getPhoneNo() {
		return phoneNo;
	}

	/**
	 * @param phoneNo the phoneNo to set
	 */
	public void setPhoneNo(Set<Long> phoneNo) {
		this.phoneNo = phoneNo;
	}

	/**
	 * @return the course
	 */
	public Map<String, String> getCourse() {
		return course;
	}

	/**
	 * @param course the course to set
	 */
	public void setCourse(Map<String, String> course) {
		this.course = course;
	}

	/**
	 * @param empName
	 * @param devices
	 * @param phoneNo
	 * @param course
	 */
	public Employee(String empName, List<String> devices, Set<Long> phoneNo, Map<String, String> course) {
		super();
		this.empName = empName;
		this.devices = devices;
		this.phoneNo = phoneNo;
		this.course = course;
	}

	/**
	 * 
	 */
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
