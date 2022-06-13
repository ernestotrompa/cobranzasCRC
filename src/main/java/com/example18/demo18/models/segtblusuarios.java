package com.example18.demo18.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "seg_tblusuarios")
public class segtblusuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iidusuario", nullable = false)
    private Integer iidusuario;

    @Column(name = "tnumdoc", nullable = false)
    private String tnumdoc;

    @Column(name = "tusuario", nullable = false)
    private String tusuario;

    @Column(name = "tprimernombre", nullable = false)
    private String tprimernombre;

    @Column(name = "tsegundonombre", nullable = false)
    private String tsegundonombre;

    

    @Column(name = "tprimerapellido", nullable = false)
    private String tprimerapellido;

    @Column(name = "tsegundoapellido", nullable = false)
    private String tsegundoapellido;

    
  
    public segtblusuarios() {

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((iidusuario == null) ? 0 : iidusuario.hashCode());
        result = prime * result + ((tnumdoc == null) ? 0 : tnumdoc.hashCode());
        result = prime * result + ((tprimernombre == null) ? 0 : tprimernombre.hashCode());
        result = prime * result + ((tsegundonombre == null) ? 0 : tsegundonombre.hashCode());
       
        result = prime * result + ((tprimerapellido == null) ? 0 : tprimerapellido.hashCode());
        result = prime * result + ((tsegundoapellido == null) ? 0 : tsegundoapellido.hashCode());   
        
        result = prime * result + ((tusuario == null) ? 0 : tusuario.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        segtblusuarios other = (segtblusuarios) obj;
        if (iidusuario == null) {
            if (other.iidusuario != null)
                return false;
        } else if (!iidusuario.equals(other.iidusuario))
            return false;
        if (tnumdoc == null) {
            if (other.tnumdoc != null)
                return false;
        } else if (!tnumdoc.equals(other.tnumdoc))
            return false;
        if (tprimernombre == null) {
            if (other.tprimernombre != null)
                return false;
        } else if (!tprimernombre.equals(other.tprimernombre))
            return false;
        if (tsegundonombre == null) {
            if (other.tsegundonombre != null)
                return false;
        } else if (!tsegundonombre.equals(other.tsegundonombre))
            return false;






        if (tprimerapellido == null) {
            if (other.tprimerapellido != null)
                return false;
        } else if (!tprimerapellido.equals(other.tprimerapellido))
            return false;


            if (tsegundoapellido == null) {
                if (other.tsegundoapellido != null)
                    return false;
            } else if (!tsegundoapellido.equals(other.tsegundoapellido))
                return false;





        if (tusuario == null) {
            if (other.tusuario != null)
                return false;
        } else if (!tusuario.equals(other.tusuario))
            return false;
        return true;
    }

    public segtblusuarios(String tnumdoc, String tusuario, String tprimernombre, String tsegundonombre, String tprimerapellido, String tsegundoapellido) {
        this.tnumdoc = tnumdoc;
        this.tusuario = tusuario;
        this.tprimernombre = tprimernombre;

        this.tprimerapellido = tprimerapellido;
        this.tsegundoapellido = tsegundoapellido;
    }

    public Integer getIidusuario() {
        return iidusuario;
    }

    public void setIidusuario(Integer iidusuario) {
        this.iidusuario = iidusuario;
    }

    public String getTnumdoc() {
        return tnumdoc;
    }

    public void setTnumdoc(String tnumdoc) {
        this.tnumdoc = tnumdoc;
    }

    public String getTusuario() {
        return tusuario;
    }

    public void setTusuario(String tusuario) {
        this.tusuario = tusuario;
    }

    public String getTprimernombre() {
        return tprimernombre;
    }

    public void setTprimernombre(String tprimernombre) {
        this.tprimernombre = tprimernombre;
    }

    public String getTsegundonombre() {
        return tsegundonombre;
    }

    public void setTsegundonombre(String tsegundonombre) {
        this.tsegundonombre = tsegundonombre;
    }


    public String getTprimerapellido() {
        return tprimerapellido;
    }

    public void setTprimerapellido(String tprimerapellido) {
        this.tprimerapellido = tprimerapellido;
    }


    public String getTsegundoapellido() {
        return tsegundoapellido;
    }

    public void setTsegundoapellido(String tsegundoapellido) {
        this.tsegundoapellido = tsegundoapellido;
    }



}
