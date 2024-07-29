package me.dio.controller.dto;

import me.dio.domain.model.News;

/**
 * Data Transfer Object (DTO) para a entidade News.
 * Utilizado para transferir dados entre camadas da aplicação.
 */
public record NewsDto(Long id, String icon, String description) {

    /**
     * Construtor que cria um NewsDto a partir de um objeto News.
     *
     * @param model Objeto News a ser convertido.
     */
    public NewsDto(News model) {
        this(model.getId(), model.getIcon(), model.getDescription());
    }

    /**
     * Converte este DTO para o modelo News.
     *
     * @return Objeto News correspondente a este DTO.
     */
    public News toModel() {
        // Cria uma nova instância do modelo News e define seus atributos com base nos valores do DTO
        News model = new News();
        model.setId(this.id);
        model.setIcon(this.icon);
        model.setDescription(this.description);
        return model;
    }
}
