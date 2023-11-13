package entity.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data; //ya contiene Getters y Setters
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "bicycle")
public class Bicycle implements Serializable{

    @Serial
    private static final long serialVersionUID = 1L; //hibernate??

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    @Column
    private int year;

}
