import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarPrueba {
	public static void main (String[] args) {
		
		Calendar calendario = new GregorianCalendar();
		
		System.out.println("Fecha actual: " + new Date());
		System.out.println("A�o: " + calendario.get(Calendar.YEAR));
		System.out.println("Mes: " + calendario.get(Calendar.MONTH));
		System.out.println("D�a: " + calendario.get(Calendar.DATE));
		
		Calendar miCalendario = new GregorianCalendar(2015, 03, 02);
		String[] dias = {"S�bado", "Domingo", "Lunes", "Martes", "Mi�rcoles", "Jueves", "Viernes"};
		System.out.println("El 1 de Abril fue: ");
		System.out.print(dias[miCalendario.get(Calendar.DAY_OF_WEEK) -1 ]);
	}
}