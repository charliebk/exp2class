public class IfcRelAssociatesMaterial extends IfcRelAssociates {
    public IfcMaterialSelect RelatingMaterial;

    // === WHERE CLAUSES ===
    // AllowedElements : SIZEOF(QUERY(temp <* SELF\IfcRelAssociates.RelatedObjects | ( SIZEOF(TYPEOF(temp) * [ 'IFC4X3_DEV_73740fe4.IFCELEMENT', 'IFC4X3_DEV_73740fe4.IFCELEMENTTYPE', 'IFC4X3_DEV_73740fe4.IFCSTRUCTURALMEMBER', 'IFC4X3_DEV_73740fe4.IFCPORT']) = 0) )) = 0
    // NoVoidElement : SIZEOF(QUERY(temp <* SELF\IfcRelAssociates.RelatedObjects | ('IFC4X3_DEV_73740fe4.IFCFEATUREELEMENTSUBTRACTION' IN TYPEOF(temp)) OR ('IFC4X3_DEV_73740fe4.IFCVIRTUALELEMENT' IN TYPEOF(temp)) )) = 0
}
