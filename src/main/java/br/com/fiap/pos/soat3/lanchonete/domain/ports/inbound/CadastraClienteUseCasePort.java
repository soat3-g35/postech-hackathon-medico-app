package br.com.fiap.pos.soat3.lanchonete.domain.ports.inbound;

import br.com.fiap.pos.soat3.lanchonete.domain.domain.Cliente;

public interface CadastraClienteUseCasePort {

    Cliente execute(Cliente cliente);
}
