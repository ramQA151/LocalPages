
describe('Mouse Handling', () => {

    
    it('Approach 1 -Mouse Right CLick', () =>{

        cy.visit('https://swisnl.github.io/jQuery-contextMenu/demo.html')

       cy.get('span.context-menu-one.btn.btn-neutral').trigger('contextmenu');

       cy.get('.context-menu-icon-edit >span').should('be.visible');
       cy.get('.context-menu-icon-edit >span').click();
    })

    it.only('Approach -2 Mouse Right CLick', () =>{

        cy.visit('https://swisnl.github.io/jQuery-contextMenu/demo.html')

       cy.get('span.context-menu-one.btn.btn-neutral').rightclick();
       cy.get('.context-menu-icon-edit >span').should('be.visible');
       cy.get('.context-menu-icon-edit >span').click();

    })
})