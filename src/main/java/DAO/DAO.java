
package DAO;

/**
 *
 * @author biancamarques
 */
public class DAO {
    
    private static final CompetenciaDAO competenciaDAO = new CompetenciaDAO();
    private static final ContrachequeDAO contrachequeDAO = new ContrachequeDAO();
    private static final DependenteDAO dependenteDAO = new DependenteDAO();
    private static final EnderecoDAO enderecoDAO = new EnderecoDAO();
    private static final LotacaoDAO lotacaoDAO = new LotacaoDAO();
    private static final MilitarDAO militarDAO = new MilitarDAO();
    private static final MovimentacaoDAO movimentacaoDAO = new MovimentacaoDAO();
    private static final PostoGraduacaoDAO postoGraduacaoDAO = new PostoGraduacaoDAO();
    private static final RelacaoDependenciaDAO relacaoDependenciaDAO = new RelacaoDependenciaDAO();

    public static CompetenciaDAO getCompetenciaDAO() {
        return competenciaDAO;
    }

    public static ContrachequeDAO getContrachequeDAO() {
        return contrachequeDAO;
    }

    public static DependenteDAO getDependenteDAO() {
        return dependenteDAO;
    }

    public static EnderecoDAO getEnderecoDAO() {
        return enderecoDAO;
    }

    public static LotacaoDAO getLotacaoDAO() {
        return lotacaoDAO;
    }

    public static MilitarDAO getMilitarDAO() {
        return militarDAO;
    }

    public static MovimentacaoDAO getMovimentacaoDAO() {
        return movimentacaoDAO;
    }

    public static PostoGraduacaoDAO getPostoGraduacaoDAO() {
        return postoGraduacaoDAO;
    }

    public static RelacaoDependenciaDAO getRelacaoDependenciaDAO() {
        return relacaoDependenciaDAO;
    }

}
