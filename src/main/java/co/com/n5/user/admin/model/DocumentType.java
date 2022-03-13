package co.com.n5.user.admin.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
@Table(name = "document_type")
@ApiModel(value = "Document Type Data Object", description = "Save de Document Type information")
public class DocumentType {

    @Id
    @Column(name = "document_type_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(notes = "Identifier of the Document Type")
    private Long id;

    @ApiModelProperty(notes = "Name of the Document Type")
    private String name;

    @ApiModelProperty(notes = "Description of the Document Type")
    private String description;

}
