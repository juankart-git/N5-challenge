package co.com.n5.user.admin.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table (name = "person")
@ApiModel(value = "Person Data Object", description = "Save de Person information")
public class Person {

    @Id
    @Column(name = "person_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(notes = "Identifier of the Person")
    private Long id;

    @ApiModelProperty(notes = "First name of the Person")
    private String firstName;

    @ApiModelProperty(notes = "Last name of the Person")
    private String lastName;

    @ApiModelProperty(notes = "Birthday of the Person")
    private String birthday;

    @ApiModelProperty(notes = "Document number of the Person")
    private String documentNumber;

    @ApiModelProperty(notes = "Gender of the Person")
    private Long gender;

    @ApiModelProperty(notes = "Document type of the Person")
    private Long documentType;

}
