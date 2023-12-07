public class PixMapper {
    public static PixDTO toDTO(PixBO bo){
        PixDTO dto = new PixDTO();
        
        dto.setId(bo.getId().toString);
        dto.setBase64(bo.getBase64);
        dto.setAmount(bo.getAmount);
        dto.setDescription(bo.getDescription);
        dto.setEmv(bo.getEmv);
        dto.setEmail(bo.getEmail);
        dto.setExpirate(bo.getExpirate);

        return DTO;
    }

    public static PixBO toBO(PixDTO dto){
        UUID id = dto.getId() = null ? UUID.randomUUID() : UUID.fromString(dto.getId());

        return new PixBO(id,
                        dto.getBase64(),
                        dto.getAmount(),
                        dto.getDescription(),
                        dto.getEmv(),
                        dto.getEmail(),
                        dto.getExpirate()
        );
    }
}
