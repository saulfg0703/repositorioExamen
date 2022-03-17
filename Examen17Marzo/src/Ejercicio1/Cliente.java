package Ejercicio1;
/*
Ejerc1_1: Extraer los datos relacionados con el telefono en otra clase llamada Telefono
 */
public class Cliente {
    private Telefono data = new Telefono();

    public static void main(String[] args) {
		System.out.println("Hola mundo");
	}


	public String getPrefijoTelefonoTrabajo() {
        return data.prefijoTelefonoTrabajo;
    }

    public void setPrefijoTelefonoTrabajo(String prefijoTelefonoTrabajo) {
        this.data.prefijoTelefonoTrabajo = prefijoTelefonoTrabajo;
    }

    public String getTelefonoTrabajo() {
        return data.telefonoTrabajo;
    }

    public void setTelefonoTrabajo(String telefonoTrabajo) {
        this.data.telefonoTrabajo = telefonoTrabajo;
    }

    public String getPrefijoTelefonoCasa() {
        return data.prefijoTelefonoCasa;
    }

    public void setPrefijoTelefonoCasa(String prefijoTelefonoCasa) {
        this.data.prefijoTelefonoCasa = prefijoTelefonoCasa;
    }

    public String getTelefonoCasa() {
        return data.telefonoCasa;
    }

    public void setTelefonoCasa(String telefonoCasa) {
        this.data.telefonoCasa = telefonoCasa;
    }
    public Cliente() {
    }

    public String getNombre() {
        return data.nombre;
    }

    public void setNombre(String nombre) {
        this.data.nombre = nombre;
    }
}
