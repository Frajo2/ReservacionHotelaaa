//Para ver el programa entrar al link https://reservacionhotelvad-1706274580796.azurewebsites.net/my-view
package com.example.application.views.myview;

import com.example.application.views.MainLayout;
import com.example.application.views.facturacion.Utils;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;

import java.time.LocalDate;

@PageTitle("My View")
@Route(value = "my-view", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
@Uses(Icon.class)
public class MyViewView extends Composite<VerticalLayout> {
    private TextField textField;
    private TextField textField2;
    private TextField textField3;
    private TextField textField4;
    private DatePicker datePicker;
    private DatePicker datePicker2;
    private TextField textField5;
    private Grid<Reserva> grid;
    public MyViewView() {
        H1 h1 = new H1();
        FormLayout formLayout2Col = new FormLayout();
        TextField textField = new TextField();
        TextField textField2 = new TextField();
        TextField textField3 = new TextField();
        TextField textField4 = new TextField();
        DatePicker datePicker = new DatePicker();
        DatePicker datePicker2 = new DatePicker();
        TextField textField5 = new TextField();
        HorizontalLayout layoutRow = new HorizontalLayout();
        Button buttonPrimary = new Button();
        Button buttonSecondary = new Button();

        grid = new Grid<>(Reserva.class);
        grid.addColumn(Reserva::getNombre).setHeader("Nombre");
        grid.addColumn(Reserva::getCedula).setHeader("Cédula");
        grid.addColumn(Reserva::getNoCel).setHeader("Número de Celular");
        grid.addColumn(Reserva::getCorreo).setHeader("Correo");
        grid.addColumn(Reserva::getIngreso).setHeader("Fecha de Ingreso");
        grid.addColumn(Reserva::getSalida).setHeader("Fecha de Salida");
        grid.addColumn(Reserva::getTipoHab).setHeader("Tipo de Habitación");
        grid.addColumn(reserva -> 50).setHeader("Precio");

        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        h1.setText("Reservación de Hotel");
        h1.setWidth("max-content");
        formLayout2Col.setWidth("100%");
        textField.setLabel("Ingrese su nombre");
        textField.setWidth("min-content");
        textField2.setLabel("Ingrese su cedula");
        textField2.setWidth("min-content");
        textField3.setLabel("Ingrese su numero de contacto");
        textField3.setWidth("min-content");
        textField4.setLabel("Ingrese su correo electronico");
        textField4.setWidth("min-content");
        datePicker.setLabel("Ingrese su dia de ingreso");
        datePicker.setWidth("min-content");
        datePicker2.setLabel("ingrese su dia de salida");
        datePicker2.setWidth("min-content");
        textField5.setLabel("Tipo de habitacion: Simple, Doble, Suite");
        textField5.setWidth("min-content");
        layoutRow.setHeightFull();

        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.getStyle().set("flex-grow", "1");
        buttonPrimary.setText("Guardar");
        buttonPrimary.setWidth("200px");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonSecondary.setText("Cancelar");
        buttonSecondary.setWidth("200px");
        getContent().add(h1);
        getContent().add(formLayout2Col);
        formLayout2Col.add(textField);
        formLayout2Col.add(textField2);
        formLayout2Col.add(textField3);
        formLayout2Col.add(textField4);
        formLayout2Col.add(datePicker);
        formLayout2Col.add(datePicker2);
        formLayout2Col.add(textField5);
        formLayout2Col.add(layoutRow);
        layoutRow.add(buttonPrimary);
        layoutRow.add(buttonSecondary);
        buttonPrimary.addClickListener(event -> {
            // Crear una nueva reserva con los datos ingresados
            Reserva nuevaReserva = new Reserva(
                    textField.getValue(),
                    textField2.getValue(),
                    textField3.getValue(),
                    textField4.getValue(),
                    datePicker.getValue(),
                    datePicker2.getValue(),
                    textField5.getValue()
            );

            // Agregar la nueva reserva a la lista de reservas
            Utils.reserva.add(nuevaReserva);

            // Actualizar el Grid con la nueva lista de reservas
            grid.setItems(Utils.reserva);
        });
    }
}
