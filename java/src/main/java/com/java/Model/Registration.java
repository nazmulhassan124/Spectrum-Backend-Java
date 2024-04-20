package com.java.Model;




import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Table(name = "stu_registration")
public class Registration {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "stu_no")
    private Integer stu_no;
	
	@Column (name="stu_id")
	private String stu_id;
	
	@Column (name="stu_name")
	private String stu_name;
	
	@Column (name="stu_phone")
	private String stu_phone;
	
	@Column (name="stu_address")
	private String stu_address;
	

}
