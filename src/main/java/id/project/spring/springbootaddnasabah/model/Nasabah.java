package id.project.spring.springbootaddnasabah.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * @author Arza Jasmelia.
 * springboot-add-nasabah
 * on 11/09/2020
 */

@Entity
@Table(name = "nasabah")
@Data
public class Nasabah {
    @Id
    @Column(name = "nik")
    @NotBlank(message = "Nik is mandatory")
    @Size(min = 1, max = 16)
    private String nik;

    @Column(name = "namakaryawan")
    @NotBlank(message = "Nama Karyawan is mandatory")
    @Size(min = 1, max = 50)
    private String namaKaryawan;

    @Column(name = "notelpn")
    @NotBlank(message = "No Telpn is mandatory")
    @Size(min = 1, max = 50)
    private String noTelp;

    @Column(name = "email")
    @NotBlank(message = "Email is mandatory")
    @Size(min = 1, max = 50)
    private String email;

    @Column(name = "tempatlahir")
    @NotBlank(message = "Tempat Lahir is mandatory")
    @Size(min = 1, max = 50)
    private String tempatLahir;

    @Column(name = "tanggallahir")
    @NotBlank(message = "Tanggal Lahir is mandatory")
    @Size(min = 1, max = 50)
    private String tanggalLahir;

    @Column(name = "alamat")
    @NotBlank(message = "Alamat Lahir is mandatory")
    @Size(min = 1, max = 255)
    private String alamat;
}
