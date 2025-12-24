# CRUD de Clientes
Escola: DevSuperior  
Instrutor: Prof. Nélio Alves

# Conteúdo do repositório
Entrega do desafio de conclusão do terceiro módulo do curso Java Spring Professional, que consiste na criação de um CRUD completo de web services REST para acessar o recurso clientes. 

# Recursos
* Java 25
* Maven 4.0.0
* Spring Boot 4.0.1
* Spring Tool Suite 4 (IDE)

# Regras
1. Deve conter 5 operações:  
* busca paginada de recursos  
* busca de recurso por id 
* inserir novo recurso
* atualizar recurso

2. Configurar ambiente de testes 

3. Configurar acesso ao banco H2

4. Criar um novo projeto (não reutilizar projetos feitos em aula)
   
5. Seguir o diagrama que faz parte do descritivo da atividade.

# Checklist
[✔] Busca por id retorna cliente existente.    
[ ] Busca por id retorna 404 para cliente inexistente.  
[✔] Busca paginada retorna listagem paginada corretamente.  
[✔] Inserção de cliente insere cliente com dados válidos.  
[ ] Inserção de cliente retorna 422 e mensagens customizadas com dados inválidos.  
[ ] Atualização de cliente atualiza cliente com dados válidos.    
[ ] Atualização de cliente retorna 404 para cliente inexistente.  
[ ] Atualização de cliente retorna 422 e mensagens customizadas com dados inválidos.  
[ ] Deleção de cliente deleta cliente existente.  
[ ] Deleção de cliente retorna 404 para cliente inexistente.  