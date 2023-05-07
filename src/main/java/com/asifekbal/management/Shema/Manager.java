package com.asifekbal.management.Shema;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;
@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@Table(name = "manager")
@DiscriminatorValue("Manager")
public class Manager extends Employee {

    private String project;

}
