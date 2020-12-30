# 4A_Projet_Mobile

Pour cette application nous avons mis en place une base de données avec Room, la Clean Aarchitecture et l'architecture MVVM.

L'application ouvre sur une page de login où l'utilisateur peut entrer un email et un mot de passe.

Lors du cliques sur le bouton de login, l'application fait un appel à la base de données pour savoir si l'utilisateur existe.
Si non, un pop-up apparait pour proposer à l'utilisateur de créer un compte.

Lors du cliques sur le bouton de creation de compte, si l'utilisateur a rempli les champs, un utilisateur est ajouté à la base de données.
S'il cliques ensuite sur le bouton de login, le pop-up n'apparait plus, ce qui signifie que l'utilisateur a bien été ajouté.
