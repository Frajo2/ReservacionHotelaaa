package com.example.application.views.facturacion;

//Para ver el programa entrar al link https://reservacionhotelvad-1706274580796.azurewebsites.net/my-view
import com.example.application.views.MainLayout;
import com.example.application.views.myview.Reserva;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Facturacion")
@Route(value = "my-view2", layout = MainLayout.class)
@Uses(Icon.class)
public class FacturacionView extends Composite<VerticalLayout> {

    public FacturacionView() {
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");

        // Crear el Grid y configurar las columnas
        Grid<Reserva> grid = new Grid<>();
        grid.addColumn(Reserva::getNombre).setHeader("Nombre");
        grid.addColumn(Reserva::getCedula).setHeader("Cedula");
        grid.addColumn(Reserva::getNoCel).setHeader("NoCel");
        grid.addColumn(Reserva::getCorreo).setHeader("Correo");
        grid.addColumn(Reserva::getIngreso).setHeader("Ingreso");
        grid.addColumn(Reserva::getSalida).setHeader("Salida");
        grid.addColumn(Reserva::getTipoHab).setHeader("TipoHab");
        grid.addColumn(reserva -> 50).setHeader("Precio");

        // Configurar la lista de reservas como fuente de datos del Grid
        grid.setItems(Utils.reserva);

        // Añadir el Grid al contenido de la vista
        getContent().add(grid);
    }

    }



