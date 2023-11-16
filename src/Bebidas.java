public class Bebidas extends Item{
    private int tamanho;
    private TipoEmbalagem tipoEmbalagem;

    public Bebidas(String nome, String codigo, double precprecoUnitarioVenda, double precoUnicatarioCusto, int tamanho, TipoEmbalagem tipoEmbalagem){
        super(nome, codigo, precprecoUnitarioVenda, precoUnicatarioCusto );
        this.tamanho = tamanho;
        this.tipoEmbalagem = tipoEmbalagem;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public TipoEmbalagem getTipoEmbalagem() {
        return tipoEmbalagem;
    }

    public void setTipoEmbalagem(TipoEmbalagem tipoEmbalagem) {
        this.tipoEmbalagem = tipoEmbalagem;
    }
}
