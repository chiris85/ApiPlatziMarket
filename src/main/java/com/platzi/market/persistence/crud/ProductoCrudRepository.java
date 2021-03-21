package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
    //Query Method

    /*Query methods ofrece facilidades al definir consultas.
    Sin embargo, a nivel de performance no es el mejor.
    Ya que si tenemos mas entidades relacionadas por debajo spring data incluye mas y mas consultas.
    Eso perjudica considerablemente el performance.
    Lo que recomiendo es que si no tiene tantas relaciones puedes usar query methods.
    Pero si tienes artas consultas.. recomiendo haver el query en JPQL y realizar los
    respectivos joins para evitar tantas consultas x debajo.*/

    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);


}
