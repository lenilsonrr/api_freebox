package api.systemfreebox.domain.lojista;


public record DadosDetalhadosLojista(

        Long id,

        String email,

        String nome,

        String telefone,

        String cnpj,

        String senha
) {
    public DadosDetalhadosLojista(Lojista lojista){
        this(lojista.getId(), lojista.getEmail(), lojista.getNome(), lojista.getTelefone(), lojista.getCnpj(),lojista.getSenha());
    }
}
