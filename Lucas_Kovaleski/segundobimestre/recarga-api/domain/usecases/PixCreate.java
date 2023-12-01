public class PixCreate {
    private IPixRepository pixRepo; 
    public PixCreate(IPixRepository pixRepo){
        this.pixRepo = pixRepo;
    }
    public PixDTO execute(PixDTO dto){
        PixBO bo = PixMapper.toBO(dto);
        PixDTO createdPixDTO = pixRepo.create(dto);
        
        bo.updateQRCode(createdPixDTO.getEmv(), createdPixDTO.getBase64(), createdPixDTO.getExpirate());

        return PixMapper.toDTO(bo);
    }


}
