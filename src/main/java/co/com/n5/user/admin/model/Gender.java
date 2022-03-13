package co.com.n5.user.admin.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
@Table(name = "gender")
@ApiModel(value = "Gender Data Object", description = "Save de Gender information")
public class Gender {

    @Id
    @Column(name="gender_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(notes = "Identifier of the Gender")
    private Long id;

    @ApiModelProperty(notes = "Name of the Gender")
    private String name;

    @ApiModelProperty(notes = "Description of the Gender")
    private String description;

}
