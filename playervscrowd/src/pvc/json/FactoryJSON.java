package pvc.json;

import java.util.ArrayList;
import java.util.List;

import pvc.environment.GameSpace;
import pvc.game.PvcGame;
import pvc.mover.MoverType;
import pvc.transformer.Transformer;
import pvc.transformer.TransformerType;

public class FactoryJSON {

	public static BoardJSON getBoard(PvcGame game){
		
		BoardJSON board = new BoardJSON();
		
		for (GameSpace space: game.getBoard().listSpaces()){
			
			SpaceJSON spaceJSON = new SpaceJSON();
			
			List<CrowdJSON> crowdsJSON = new ArrayList<CrowdJSON>();
			
			for (MoverType mType: game.getConfig().getMoverTypes()){
				
				CrowdJSON crowdJSON = new CrowdJSON();
				
				crowdJSON.setType(mType.id);
				
				crowdJSON.setTotal(space.getCrowd(mType.id).getTotal());
				
				crowdsJSON.add(crowdJSON);
				
			}
			
			spaceJSON.setCrowds(crowdsJSON);
			
		}
		
		List<TransformerTypeJSON> ttypesJSON = new ArrayList<TransformerTypeJSON>();
		
		for (TransformerType tType: game.getConfig().getTransformerTypes()){
			
			TransformerTypeJSON ttypeJSON = new TransformerTypeJSON();
			
			List<TransformerJSON> transformersJSON = new ArrayList<TransformerJSON>();
			
			for (Transformer tranformer : game.getTransformers(tType.id)){
				
				TransformerJSON transformerJSON = new TransformerJSON();
				
				transformerJSON.setId(tranformer.id);
				
				transformerJSON.setForm(tranformer.getForm());
				
				transformersJSON.add(transformerJSON);
				
			}
			
			ttypeJSON.setTransformers(transformersJSON);
			
			ttypesJSON.add(ttypeJSON);
			
		}
		
		board.setTtypes(ttypesJSON);
		
		return board;
		
	}
	
}
