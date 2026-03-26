package com.myweb.mavenproject1;

    import com.myweb.mavenproject1.dao.DocumentoDAO;
    import com.myweb.mavenproject1.dao.LoginUsuarioDAO;
    import com.myweb.mavenproject1.entidades.Documento;
    import com.myweb.mavenproject1.entidades.LoginUsuario;

    import java.util.Date;
    import java.util.List;

    public class Main {

    public static void main(String[] args) {

        // DOCUMENTOS

        DocumentoDAO dao = new DocumentoDAO();

        Documento doc = new Documento();
        doc.setNumeroRadicado("RAD-E-2026-25-00033");
        doc.setTipoDocumento("Comuncación de Entrada");
        doc.setAsunto("Prueba Hibernate 2");
        doc.setRemitente("Empresa A");
        doc.setDestinatario("Empresa B");
        doc.setFechaRadicacion(new Date());
        doc.setFechaVencimiento(new Date());
        doc.setEstado("Devuelto");
        doc.setUsuarioId(1);
        doc.setDependencia("Contabilidad");
        doc.setObservaciones("Corrección de nómina");
        doc.setFechaCreacion(new Date());

        dao.guardar(doc);

        List<Documento> documentos = dao.listar();

        for (Documento d : documentos) {
            System.out.println("ID: " + d.getId());
            System.out.println("Radicado: " + d.getNumeroRadicado());
            System.out.println("Asunto: " + d.getAsunto());
            System.out.println("------------------------");
        }

        // LOGIN

        LoginUsuarioDAO daoUsuario = new LoginUsuarioDAO();

        LoginUsuario user = new LoginUsuario();
        user.setNombre("Roberto Montes");
        user.setContraseña("2327690");
        user.setRol("Funcionario2");
      
        // daoUsuario.guardar(user);

        List<LoginUsuario> usuarios = daoUsuario.listar();

        // LISTAR USUARIOS
        
        System.out.println("LISTA USUARIOS");

        for (LoginUsuario u : usuarios) {
            System.out.println("ID: " + u.getId());
            System.out.println("Nombre: " + u.getNombre());
            System.out.println("Rol: " + u.getRol());
            System.out.println("------------------------");
        }

        // ACTUALIZAR USUARIO 
        
        for (LoginUsuario u : usuarios) {
            if (u.getId() == 8) {

                u.setNombre("Samir Cardona Actualizado");
                u.setContraseña("6748599");
                u.setRol("Funcionario3");

                daoUsuario.actualizar(u);

                System.out.println("Usuario actualizado correctamente");
                break;
            }   
        }
        
        // ELIMINAR USUARIOS

        for (LoginUsuario u : usuarios) {
            if (u.getId() == 9 || u.getId() == 10 || u.getId() == 11) {
                daoUsuario.eliminar(u.getId());
                System.out.println("Usuario eliminado correctamente ID: " + u.getId());
                
            }
        }

    } 

}