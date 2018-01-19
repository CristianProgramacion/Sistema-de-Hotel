
package dto;

import java.util.List;
import java.util.Objects;


public class HabitacionDTO {
    private int idHab; 
    private String descripcionHab; 
    private int NumeroHab; 
    private double CostoHab; 
    private int idTph; 
    private String EstadoHab; 
    private int Piso_idPis;

   
    
    public HabitacionDTO(int NumeroHab, int idTph, String EstadoHab) {
        this.NumeroHab = NumeroHab;
        this.idTph = idTph;
        this.EstadoHab = EstadoHab;
    }

   
    
    public HabitacionDTO( String descripcionHab, int NumeroHab, double CostoHab, int idTph, String EstadoHab, int Piso_idPis) {
        this.descripcionHab = descripcionHab;
        this.NumeroHab = NumeroHab;
        this.CostoHab = CostoHab;
        this.idTph = idTph;
        this.EstadoHab = EstadoHab;
        this.Piso_idPis = Piso_idPis;
    }


    public HabitacionDTO() {
    }

   

    public int getIdHab() {
        return idHab;
    }

    public void setIdHab(int idHab) {
        this.idHab = idHab;
    }

    public String getDescripcionHab() {
        return descripcionHab;
    }

    public void setDescripcionHab(String descripcionHab) {
        this.descripcionHab = descripcionHab;
    }

    public int getNumeroHab() {
        return NumeroHab;
    }

    public void setNumeroHab(int NumeroHab) {
        this.NumeroHab = NumeroHab;
    }

    public double getCostoHab() {
        return CostoHab;
    }

    public void setCostoHab(double CostoHab) {
        this.CostoHab = CostoHab;
    }

    public int getIdTph() {
        return idTph;
    }

    public void setIdTph(int idTph) {
        this.idTph = idTph;
    }

    public String getEstadoHab() {
        return EstadoHab;
    }

    public void setEstadoHab(String EstadoHab) {
        this.EstadoHab = EstadoHab;
    }

    public int getPiso_idPis() {
        return Piso_idPis;
    }

    public void setPiso_idPis(int Piso_idPis) {
        this.Piso_idPis = Piso_idPis;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "idHab=" + idHab + ", descripcionHab=" + descripcionHab + ", NumeroHab=" + NumeroHab + ", CostoHab=" + CostoHab + ", idTph=" + idTph + ", EstadoHab=" + EstadoHab + ", Piso_idPis=" + Piso_idPis + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.idHab;
        hash = 29 * hash + Objects.hashCode(this.descripcionHab);
        hash = 29 * hash + this.NumeroHab;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.CostoHab) ^ (Double.doubleToLongBits(this.CostoHab) >>> 32));
        hash = 29 * hash + this.idTph;
        hash = 29 * hash + Objects.hashCode(this.EstadoHab);
        hash = 29 * hash + this.Piso_idPis;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HabitacionDTO other = (HabitacionDTO) obj;
        if (this.idHab != other.idHab) {
            return false;
        }
        if (this.NumeroHab != other.NumeroHab) {
            return false;
        }
        if (Double.doubleToLongBits(this.CostoHab) != Double.doubleToLongBits(other.CostoHab)) {
            return false;
        }
        if (this.idTph != other.idTph) {
            return false;
        }
        if (this.Piso_idPis != other.Piso_idPis) {
            return false;
        }
        if (!Objects.equals(this.descripcionHab, other.descripcionHab)) {
            return false;
        }
        if (!Objects.equals(this.EstadoHab, other.EstadoHab)) {
            return false;
        }
        return true;
    }
    
    
    
}
