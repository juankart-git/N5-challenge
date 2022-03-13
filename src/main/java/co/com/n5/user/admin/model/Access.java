package co.com.n5.user.admin.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table (name = "access")
@ApiModel(value = "Access Level Data Object", description = "Save de Access level information")
public class Access {

    @Id
    @Column(name="access_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(notes = "Identifier of the Access level")
    private Long id;

    @ApiModelProperty(notes = "Name of the Access level")
    private String name;

    @ApiModelProperty(notes = "Description of the Access level")
    private String description;

}
