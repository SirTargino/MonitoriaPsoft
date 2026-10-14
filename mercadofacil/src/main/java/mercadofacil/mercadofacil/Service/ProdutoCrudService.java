package mercadofacil.mercadofacil.Service;

import mercadofacil.mercadofacil.Dto.ProdutoPostPutDto;
import mercadofacil.mercadofacil.Dto.ProdutoResponseDto;

import java.util.List;

public interface ProdutoCrudService {
    ProdutoResponseDto criarProduto(ProdutoPostPutDto produtoPostPutDto);

    ProdutoResponseDto atualizarProduto(Long id, ProdutoPostPutDto produtoPostPutDto);

    void removerProduto(Long id);

    List<ProdutoResponseDto> buscarTodosProdutos();

    List<ProdutoResponseDto> buscarProdutoPorNome(String nomeProduto);
}
