package br.com.fiap.coolshoeswebflux.dto

import br.com.fiap.coolshoeswebflux.model.PessoaDocument

data class PessoaDTO(
        val id: String,
        val nome: String,
        val cpf: String? = null
) {
    constructor(pessoaDocument: PessoaDocument) : this(
            id = pessoaDocument.id ?: "Sem ID",
            nome = pessoaDocument.nome,
            cpf = pessoaDocument.cpf
    )
}
