package com.dream.springcloud.entities;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;


@NoArgsConstructor
@Data
@Accessors(chain=true)
public class Dept implements  Serializable {

	private long deptno;
	
	private String dname;
	
	private String db_source;
}
