package api.systemfreebox.domain.lojista;

public record DadosListagemLojista(

        Long id,
        String nome,
        String cnpj,
        String senha

){

    public DadosListagemLojista(Lojista lojista){
            this(lojista.getId(), lojista.getNome(), lojista.getCnpj(),lojista.getSenha());
        }
}
