# DevSuperiorSpringReactWeek
Projeto da Semana Spring React do DevSuperior


# Passo: Implantação no Heroku
Criar app no Heroku
Provisionar banco Postgres
Definir variável APP_PROFILE=prod
Conectar ao banco via pgAdmin
Criar seed do banco
heroku -v
heroku login
heroku git:remote -a <nome-do-app>
git remote -v
git subtree push --prefix backend heroku main

# Passo: implantação no Netlify
Deploy básico

Base directory: frontend
Build command: yarn build
Publish directory: frontend/build
Arquivo _redirects

/* /index.html 200
Configurações adicionais
Site settings -> Domain Management: (colocar o nome que você quiser)
Deploys -> Trigger deploy