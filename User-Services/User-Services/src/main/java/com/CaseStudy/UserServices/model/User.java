package com.CaseStudy.UserServices.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Users")

public class User {
	
	@Id
	private int adults;
	private int age;
	
    age: number,
    children: number,
    classType: string,
    endPoint: string,
    flightNo: number,
    id: number,
    name: string,
    payment: string,
    pnrNo: number,
    sex: string,
    startPoint: string

	
	
}
