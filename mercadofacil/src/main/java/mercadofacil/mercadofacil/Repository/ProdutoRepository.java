package mercadofacil.mercadofacil.Repository;

import mercadofacil.mercadofacil.Model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository  extends JpaRepository<Produto, Long> {
    public List<Produto> findByNomeProdutoContainingIgnoreCaseOrderByNomeProdutoAsc(String nomeProduto);
}
