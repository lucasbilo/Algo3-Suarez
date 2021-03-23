//cC

import java.util.*;
import java.util.stream.Collectors;

public class Streams {

    public static void main(String[] args) {
        List<Alumno> alumnos = new ArrayList<>(List.of(
                new Alumno("Nicolas", 7.80),
                new Alumno("Julian", 6.10),
                new Alumno("Julieta", 7.40),
                new Alumno("Sebastian", 8.90),
                new Alumno("Martina", 5.25),
                new Alumno("Lautaro", 4.90),
                new Alumno("Jonathan", 9.30),
                new Alumno("Joaquin", 7.00),
                new Alumno("Ana", 7.80),
                new Alumno("Florencia", 6.10)
        ));

        //distinct
        //limit
        //skip
        //count

            //FILTER
//        List<Alumno> alumnosQuePromocionan = alumnos.stream().filter(a -> a.getPromedio() >= 7).collect(Collectors.toList());
//        alumnosQuePromocionan.forEach(a -> System.out.println(a));

            //MAP
//        List<String> nombre = alumnos.stream().map(a -> a.getNombre()).collect(Collectors.toList());
//        nombre.forEach(a -> System.out.println(a));

            //SORT Y SKIP
//        List<Alumno> alumnosOrdenados = alumnos.stream().
//                sorted(Comparator.comparing(Alumno::getPromedio)).
//                skip(8).
//                collect(Collectors.toList());
//        alumnosOrdenados.forEach(a -> System.out.println(a));

            // ALL MATCH
//        boolean todosAprueban = alumnos.stream().allMatch(a -> a.getPromedio() >= 4);
//        System.out.println(todosAprueban );
//
            // ANY MATCH
//        boolean alguienPromociona = alumnos.stream().anyMatch(a -> a.getPromedio() >= 7);
//        System.out.println(alguienPromociona);

            // NONE MATCH
//        boolean todosAprueban = alumnos.stream().noneMatch(a -> a.getPromedio() < 4);
//        System.out.println(todosAprueban);

            // PEEK
//        List<String> nombresDeAlumnosQuePromocionan = alumnos.stream().
//                                                        filter(a -> a.getPromedio() >= 7).
//                                                        peek(a -> System.out.println(a)).
//                                                        map(a -> a.getNombre()).
//                                                        collect(Collectors.toList());
//        nombresDeAlumnosQuePromocionan.forEach(a -> System.out.println(a));

            // FIND FIRST
//        Optional<Alumno> primerAlumno = alumnos.stream().findFirst();
//        primerAlumno.ifPresent(a -> System.out.println(a));

            // MAX
//        Optional<Alumno> alumnoDeMayorPromedio = alumnos.stream().max(Comparator.comparing(a -> a.getPromedio()));
//        alumnoDeMayorPromedio.ifPresent(a -> System.out.println(a));

            // MIN
//        Optional<Alumno> alumnoDeMenorPromedio = alumnos.stream().min(Comparator.comparing(a -> a.getPromedio()));
//        alumnoDeMenorPromedio.ifPresent(a -> System.out.println(a));

            // AGRUPAR
//        Map<Boolean, List<Alumno>> alumnosAgrupados = alumnos.stream().
//                                                        collect(Collectors.groupingBy(a -> a.promociona()));
//        System.out.println(alumnosAgrupados);








    }
}
