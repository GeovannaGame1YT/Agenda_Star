package View;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.db4o.ObjectSet;
import com.db4o.query.Query;

import Dominio.CepModel;
import Dominio.PessoaModel;
import Util.ConectandoApi;
import Util.DBConexao;
import javax.swing.LayoutStyle.ComponentPlacement;

public class TelaPricipalPessoaView {

	private JFrame frmAgendaStar;
	private GroupLayout groupLayout;
	private Component btPesquisar;
	private Component btnPesquisarCep;
	private Component btCarregar;
	private Component btComfirmar;
	private Component btnNewButton_1;
	private Component btFecharDB;
	private JTextField tfCep;
	private JTextField tfEstado;
	private JTextField tfCidade;
	private JTextField tfLogradouro;
	private JTextField tfBairro;
	private JTextField tfComplemento;
	private JTextField tfTelefone;
	private JTextField tfComercial;
	private JTextField tfCelular;
	private JTextField tfEmail;
	private JTextField tfLocalTrabalho;
	private JTextField tfCodigo;
	private JTextField tfNome;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPricipalPessoaView window = new TelaPricipalPessoaView();
					window.frmAgendaStar.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaPricipalPessoaView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAgendaStar = new JFrame();
		frmAgendaStar.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Admin\\eclipse-workspace\\Agenda\\resources\\AgendaStar.png"));
		frmAgendaStar.setTitle("Agenda Star");
		frmAgendaStar.setBounds(100, 100, 645, 423);
		frmAgendaStar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		


		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frmAgendaStar.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setToolTipText("");
		tabbedPane.addTab("Registrar pessoa", null, panelPrincipal, null);
		
		JLabel lblNewLabel_2 = new JLabel("CEP");
		
		tfCep = new JTextField();
		tfCep.setColumns(10);
		
		JButton btnPesquisarCepf = new JButton("Pesquisar CEP");
		btnPesquisarCepf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PesquisarCep();
			}
		});
		
		JLabel lblNewLabel_4 = new JLabel("Estado");
		
		tfEstado = new JTextField();
		tfEstado.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Cidade");
		
		tfCidade = new JTextField();
		tfCidade.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Logradouro");
		
		tfLogradouro = new JTextField();
		tfLogradouro.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Bairro");
		
		tfBairro = new JTextField();
		tfBairro.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Complemento");
		
		tfComplemento = new JTextField();
		tfComplemento.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Telefone");
		
		tfTelefone = new JTextField();
		tfTelefone.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Comercial");
		
		tfComercial = new JTextField();
		tfComercial.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Celular");
		
		tfCelular = new JTextField();
		tfCelular.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("E-mail");
		
		tfEmail = new JTextField();
		tfEmail.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("local de trabalho");
		
		tfLocalTrabalho = new JTextField();
		tfLocalTrabalho.setColumns(10);
		
		JButton btAbrirBanco = new JButton("Abrir Banco");
		btAbrirBanco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AbrirBanco();
			}
		});
		
		JButton btFecharDBf = new JButton("Fechar Banco");
		btFecharDBf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FecharBanco();
			}
		});
		
		JButton btGravar = new JButton("Gravar");
		btGravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GravarPessoa();
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("Codigo");
		
		tfCodigo = new JTextField();
		tfCodigo.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome");
		
		tfNome = new JTextField();
		tfNome.setColumns(10);
		
		JButton btPesquisarf = new JButton("Pesquisar");
		btPesquisarf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PesquisarPessoa();
			}
		});
		GroupLayout gl_panelPrincipal = new GroupLayout(panelPrincipal);
		gl_panelPrincipal.setHorizontalGroup(
			gl_panelPrincipal.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelPrincipal.createSequentialGroup()
					.addGap(43)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(tfCodigo, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(tfNome, GroupLayout.PREFERRED_SIZE, 253, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(btPesquisarf))
				.addGroup(gl_panelPrincipal.createSequentialGroup()
					.addGap(56)
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(tfCep, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
					.addGap(35)
					.addComponent(btnPesquisarCepf))
				.addGroup(gl_panelPrincipal.createSequentialGroup()
					.addGap(43)
					.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(tfEstado, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(lblNewLabel_6)
					.addGap(4)
					.addComponent(tfCidade, GroupLayout.PREFERRED_SIZE, 239, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panelPrincipal.createSequentialGroup()
					.addGap(23)
					.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(tfLogradouro, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(lblNewLabel_8)
					.addGap(4)
					.addComponent(tfBairro, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panelPrincipal.createSequentialGroup()
					.addGap(10)
					.addComponent(lblNewLabel_9, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(tfComplemento, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panelPrincipal.createSequentialGroup()
					.addGap(29)
					.addComponent(lblNewLabel_10, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(tfTelefone, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(lblNewLabel_12)
					.addGap(10)
					.addComponent(tfComercial, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(lblNewLabel_7)
					.addGap(4)
					.addComponent(tfCelular, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panelPrincipal.createSequentialGroup()
					.addGap(45)
					.addComponent(lblNewLabel_13, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(tfEmail, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panelPrincipal.createSequentialGroup()
					.addGap(10)
					.addComponent(lblNewLabel_14)
					.addGap(10)
					.addComponent(tfLocalTrabalho, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panelPrincipal.createSequentialGroup()
					.addGap(240)
					.addComponent(btAbrirBanco, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(btFecharDBf, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(btGravar, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
		);
		gl_panelPrincipal.setVerticalGroup(
			gl_panelPrincipal.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelPrincipal.createSequentialGroup()
					.addGap(11)
					.addGroup(gl_panelPrincipal.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelPrincipal.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNewLabel_1))
						.addComponent(tfCodigo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panelPrincipal.createSequentialGroup()
							.addGap(4)
							.addComponent(lblNewLabel))
						.addGroup(gl_panelPrincipal.createSequentialGroup()
							.addGap(1)
							.addComponent(tfNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(btPesquisarf))
					.addGap(11)
					.addGroup(gl_panelPrincipal.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelPrincipal.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNewLabel_2))
						.addGroup(gl_panelPrincipal.createSequentialGroup()
							.addGap(1)
							.addComponent(tfCep, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnPesquisarCepf))
					.addGap(21)
					.addGroup(gl_panelPrincipal.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelPrincipal.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNewLabel_4))
						.addComponent(tfEstado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panelPrincipal.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNewLabel_6))
						.addComponent(tfCidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panelPrincipal.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelPrincipal.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNewLabel_5))
						.addComponent(tfLogradouro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panelPrincipal.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNewLabel_8))
						.addComponent(tfBairro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panelPrincipal.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelPrincipal.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNewLabel_9))
						.addComponent(tfComplemento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panelPrincipal.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_10)
						.addGroup(gl_panelPrincipal.createSequentialGroup()
							.addGap(3)
							.addComponent(tfTelefone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelPrincipal.createSequentialGroup()
							.addGap(6)
							.addComponent(lblNewLabel_12))
						.addGroup(gl_panelPrincipal.createSequentialGroup()
							.addGap(3)
							.addComponent(tfComercial, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelPrincipal.createSequentialGroup()
							.addGap(6)
							.addComponent(lblNewLabel_7))
						.addGroup(gl_panelPrincipal.createSequentialGroup()
							.addGap(3)
							.addComponent(tfCelular, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(14)
					.addGroup(gl_panelPrincipal.createParallelGroup(Alignment.LEADING)
						.addComponent(tfEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panelPrincipal.createSequentialGroup()
							.addGap(4)
							.addComponent(lblNewLabel_13)))
					.addGap(11)
					.addGroup(gl_panelPrincipal.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelPrincipal.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNewLabel_14))
						.addComponent(tfLocalTrabalho, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panelPrincipal.createParallelGroup(Alignment.LEADING)
						.addComponent(btAbrirBanco)
						.addComponent(btFecharDBf)
						.addComponent(btGravar)))
		);
		panelPrincipal.setLayout(gl_panelPrincipal);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Pessoas Gravadas", null, panel_1, null);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(50, 50));
		panel_1.add(panel, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Carregar Dados");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CaregarDodos();
			}
		});
		
		JButton btnNewButton_2 = new JButton("Altrerar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AlterarPessoa();
			}
		});
		panel.add(btnNewButton_2);
		
		JButton btExcluir = new JButton("Excluir");
		btExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ExcluirPessoa();
			}
		});
		panel.add(btExcluir);
		panel.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		panel_1.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Codigo", "Nome", "CEP", "Estado", "Cidade", "Logradouro", "Bairro", "Complemento", "Telefone", "Comercial", "Celular", "Email", "local de trabalho"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(table);
	}
	private void PesquisarCep()
	{
		int cep = Integer.parseInt(tfCep.getText());
		
		
		CepModel cepModel;
		//conequita com a api
		ConectandoApi connect = new ConectandoApi();
		cepModel = connect.doGeCep(cep);
		/*PessoaModel pessoa = new PessoaModel();
		pessoa.setCep(tfCep.getText());*/
		
		//envia os dados da api cep para a tela 
		tfCidade.setText(cepModel.getLocalidade());
		tfLogradouro.setText(cepModel.getLogradouro());
		tfBairro.setText(cepModel.getBairro());
		tfComplemento.setText(cepModel.getComplemento());
		tfEstado.setText(cepModel.getUf());
		//tfCelular.setText(cepModel.getDdd());
		
		//cep = setCep(Integer.parseInt(tfCep.getText()));
	}
	
	public void GravarPessoa() 
	{
		
		//envia todos os dados do para o banco para ser gravado
		PessoaModel pessoa = new PessoaModel();
		pessoa.setCodigo(Integer.parseInt(tfCodigo.getText()));
		pessoa.setNome(tfNome.getText());
		pessoa.setCep(tfCep.getText());
		pessoa.setUf(tfEstado.getText());
		pessoa.setBairro(tfBairro.getText());
		pessoa.setComplemento(tfComplemento.getText());
		pessoa.setLocalidade(tfCidade.getText());
		pessoa.setLogradouro(tfLogradouro.getText());
		pessoa.setComercial(Integer.parseInt(tfComercial.getText()));
		pessoa.setCelular(Integer.parseInt(tfCelular.getText()));
		pessoa.setTelefone(Integer.parseInt(tfTelefone.getText()));
		pessoa.setEmail(tfEmail.getText());
		pessoa.setLocalTrabalho(tfLocalTrabalho.getText());
		//recebe os dados e grava no banco
		DBConexao.GetConexao().store(pessoa);
		
		//se não aparecer esta messagem é porque deu problema ;D
		JOptionPane.showMessageDialog(null, "Pessoa gravada com sucesso.");
	}
	private void AbrirBanco()
	{
		//realiza coneção como o banco de dados
		if(DBConexao.GetConexao() == null)
			JOptionPane.showMessageDialog(null, "Conexão não realizada.");
		else
		{
			JOptionPane.showMessageDialog(null, "Conexão realizada.");
			//CaregarDodos();
		}
	}
	
	//fecha a conexão do banco
	private void FecharBanco() 
	{
		DBConexao.Fechar();
		JOptionPane.showMessageDialog(null, "Banco fechado com sucesso.");
	}
	
	//Esta parte é encaregada de caregar os dados para a tabela.
	private void CaregarDodos()
	{	

		//new PessoasGavadas().setVisible(true);
		
		PessoaModel pessoam;
		
		DefaultTableModel dt = (DefaultTableModel)table.getModel();
		
		dt.setRowCount(0);

		Query query = DBConexao.GetConexao().query();
		query.constrain(PessoaModel.class);
		ObjectSet pessoas = query.execute();
		
		while(pessoas.hasNext())
		{
			pessoam = (PessoaModel)pessoas.next();
			dt.addRow(new String[] { String.valueOf(pessoam.getCodigo()), pessoam.getNome(), pessoam.getCep(), pessoam.getUf(), 
					pessoam.getLocalidade(), pessoam.getLogradouro(), pessoam.getBairro(), pessoam.getComplemento(), 
					String.valueOf(pessoam.getTelefone()), String.valueOf(pessoam.getComercial()), String.valueOf(pessoam.getCelular()), 
					pessoam.getEmail(), pessoam.getLocalTrabalho() });
		}
		
		/*((PessoaModel) query).getCodigo().equals(TabableView);
		((PessoaModel) query).getNome().equals("");
		((PessoaModel) query).getCep().equals("");*/
	}
	
	private void PesquisarPessoa()
	{
		int codigo = Integer.parseInt(tfCodigo.getText());
		
		PessoaModel pessoaModel = null;
		CepModel connect = new CepModel();
		PessoaModel pessoam = new PessoaModel();
		pessoam.setCodigo(codigo);
		ObjectSet result = DBConexao.GetConexao().queryByExample(pessoam);
		if(result.hasNext())
			pessoam = (PessoaModel)result.next();
		
		tfCodigo.setText(String.valueOf(pessoam.getCodigo()));
		tfNome.setText(pessoam.getNome());
		tfCep.setText(pessoam.getCep());
		tfEstado.setText(pessoam.getUf());
		tfCidade.setText(pessoam.getLocalidade());
		tfLogradouro.setText(pessoam.getLogradouro());
		tfBairro.setText(pessoam.getBairro());
		tfComplemento.setText(pessoam.getComplemento());
		tfTelefone.setText(String.valueOf(pessoam.getTelefone()));
		tfComercial.setText(String.valueOf(pessoam.getComercial()));
		tfCelular.setText(String.valueOf(pessoam.getCelular()));
		tfEmail.setText(pessoam.getEmail());
		tfLocalTrabalho.setText(pessoam.getLocalTrabalho());
		
		
		
		Query query = DBConexao.GetConexao().query();
		query.constrain(PessoaModel.class);
		ObjectSet pessoas = query.execute();
		
		while(pessoas.hasNext())
		{
			pessoam = (PessoaModel)pessoas.next();
			tfCodigo.setText(String.valueOf(((PessoaModel) pessoas).getCodigo()));
			tfNome.setText(((PessoaModel) pessoas).getNome());
			tfCep.setText(((PessoaModel) pessoas).getCep());
			tfEstado.setText(((PessoaModel) pessoas).getUf());
			tfCidade.setText(((PessoaModel) pessoas).getLocalidade());
			tfLogradouro.setText(((PessoaModel) pessoas).getLogradouro());
			tfBairro.setText(((PessoaModel) pessoas).getBairro());
			tfComplemento.setText(((PessoaModel) pessoas).getComplemento());
			tfTelefone.setText(String.valueOf(((PessoaModel) pessoas).getTelefone()));
			tfComercial.setText(String.valueOf(((PessoaModel) pessoas).getComercial()));
			tfCelular.setText(String.valueOf(((PessoaModel) pessoas).getCelular()));
			tfEmail.setText(((PessoaModel) pessoas).getEmail());
			tfLocalTrabalho.setText(((PessoaModel) pessoas).getLocalTrabalho());
			
		}
	}
	
	private void ExcluirPessoa()
	{
		int selecionado = -1;
		DefaultTableModel dt =  (DefaultTableModel)table.getModel();
		selecionado = table.getSelectedRow();
		int codigo = Integer.parseInt((String)dt.getValueAt(selecionado, 0));
		
		Query query = DBConexao.GetConexao().query();
		query.constrain(PessoaModel.class);
		ObjectSet pessoas = query.execute();
		
		PessoaModel pessoam = new PessoaModel();
		pessoam.setCodigo(codigo);
		ObjectSet result = DBConexao.GetConexao().queryByExample(pessoam);
		if(result.hasNext())
		{
			pessoam = (PessoaModel)result.next();
			DBConexao.GetConexao().delete(pessoam);
			CaregarDodos();
			JOptionPane.showMessageDialog(null, "Pessoa Excluida com Sucasso");
		}
	}
	
	private void AlterarPessoa()
	{
		int selecionado = -1;

		selecionado = table.getSelectedRow();

		DefaultTableModel dt =  (DefaultTableModel)table.getModel();

		int codigo = Integer.parseInt((String)dt.getValueAt(selecionado, 0));

		PessoaModel pessoam = new PessoaModel();
		pessoam.setCodigo(codigo);
		ObjectSet result = DBConexao.GetConexao().queryByExample(pessoam);
		if(result.hasNext())
			pessoam = (PessoaModel)result.next();
		
		pessoam.setCodigo(Integer.parseInt(tfCodigo.getText()));
		pessoam.setNome(tfNome.getText());
		pessoam.setCep(tfCep.getText());
		pessoam.setUf(tfEstado.getText());
		pessoam.setBairro(tfBairro.getText());
		pessoam.setComplemento(tfComplemento.getText());
		pessoam.setLocalidade(tfCidade.getText());
		pessoam.setLogradouro(tfLogradouro.getText());
		pessoam.setComercial(Integer.parseInt(tfComercial.getText()));
		pessoam.setCelular(Integer.parseInt(tfCelular.getText()));
		pessoam.setTelefone(Integer.parseInt(tfTelefone.getText()));
		pessoam.setEmail(tfEmail.getText());
		pessoam.setLocalTrabalho(tfLocalTrabalho.getText());
		
		DBConexao.GetConexao().store(pessoam);
		
		JOptionPane.showMessageDialog(null, "Pessoa Alterada com suçeso ");
		
	}

}
