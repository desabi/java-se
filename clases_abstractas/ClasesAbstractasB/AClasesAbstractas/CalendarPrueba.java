import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarPrueba {
	public static void main (String[] args) {
		
		Calendar calendario = new GregorianCalendar();
		
		System.out.println("Fecha actual: " + new Date());
		System.out.println("Año: " + calendario.get(Calendar.YEAR));
		System.out.println("Mes: " + calendario.get(Calendar.MONTH));
		System.out.println("Día: " + calendario.get(Calendar.DATE));
		
		Calendar miCalendario = new GregorianCalendar(2015, 03, 02);
		String[] dias = {"Sábado", "Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};
		System.out.println("El 1 de Abril fue: ");
		System.out.print(dias[miCalendario.get(Calendar.DAY_OF_WEEK) -1 ]);
	}
}