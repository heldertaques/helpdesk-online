<div id='cssmenu'>
Usuario Logado:<input type="text" style="font-size: 18;border: 0;
				background-color: transparent;color: red;width: 250px" value="${logado.nome}">
<ul>
   <li><a href='Principal.jsp'><span>Home</span></a></li>
   <li class='has-sub '><a href='#'><span>Ocorrências</span></a>
      <ul>
         <li><a href='CadastroOcorrencia.jsp'><span>Abrir Chamado</span></a></li>
         <li><a href='PesquisarTodasOcorrencias'><span>Consultar Chamado</span></a></li>
      </ul>
   </li>
   <li class='has-sub '><a href='#'><span>Cadastro</span></a>
      <ul>
         <li><a href='PesquisarTodosCargos'><span>Cadastrar Funcionarios</span></a></li>
         <li><a href='ServletPesquisarFuncionariosNaoUsuarios'><span>Cadastrar Usuário</span></a></li>
         <li><a href='PesquisarProximoCodCargo'><span>Cadastrar Cargo</span></a></li>
         <li><a href='CadastroSetor.jsp'><span>Cadastrar Setor</span></a></li>
         <li><a href='CadastroEquipamento.jsp'><span>Cadastrar Equipamento</span></a></li>
         <li><a href='CadastroStatusOcorrencia.jsp'><span>Cadastrar Status</span></a></li>
         <li><a href='CadastroTipoOcorrencia.jsp'><span>Cadastrar Tipo de Ocorrência</span></a></li>         
      </ul>
   </li>
      <li class='has-sub '><a href='#'><span>Manutenção</span></a>
      <ul>
         <li><a href='ListaDeFuncionariosParaAlteracao'><span>Alterar Funcionários</span></a></li>
         <li><a href='PesquisarTodosUsuarios'><span>Alterar Usuário</span></a></li>
         <li><a href='ListarTipoOcorrencia'><span>Alterar Tipo de Ocorrência</span></a></li>
         <li><a href='#'><span>Alterar Setor</span></a></li>
         <li><a href='ServletListarFuncionarios'><span>Listar os Funcionários</span></a></li>
      </ul>
   </li>
   
   <li class='has-sub '><a href='#'><span>Relatórios</span></a>
      <ul>
         <li><a href='#'><span>Chamados por Usuario</span></a></li>
         <li><a href='#'><span>Chamados Atendidos no SLA</span></a></li>
      </ul>
   </li>
</ul></div>
