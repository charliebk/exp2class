class IfcDocumentInformation extends IfcExternalInformation {
    constructor() {
        /** @type {IFCIDENTIFIER} */
        this.Identification = null;
        /** @type {IFCLABEL} */
        this.Name = null;
        /** @type {IFCTEXT} */
        this.Description = null;
        /** @type {IFCURIREFERENCE} */
        this.Location = null;
        /** @type {IFCTEXT} */
        this.Purpose = null;
        /** @type {IFCTEXT} */
        this.IntendedUse = null;
        /** @type {IFCTEXT} */
        this.Scope = null;
        /** @type {IFCLABEL} */
        this.Revision = null;
        /** @type {IFCACTORSELECT} */
        this.DocumentOwner = null;
        /** @type {SET [1:?] OF IFCACTORSELECT} */
        this.Editors = null;
        /** @type {IFCDATETIME} */
        this.CreationTime = null;
        /** @type {IFCDATETIME} */
        this.LastRevisionTime = null;
        /** @type {IFCIDENTIFIER} */
        this.ElectronicFormat = null;
        /** @type {IFCDATE} */
        this.ValidFrom = null;
        /** @type {IFCDATE} */
        this.ValidUntil = null;
        /** @type {IFCDOCUMENTCONFIDENTIALITYENUM} */
        this.Confidentiality = null;
        /** @type {IFCDOCUMENTSTATUSENUM} */
        this.Status = null;
    }

    // === INVERSE CLAUSES ===
    // DocumentInfoForObjects : SET [0:?] OF IfcRelAssociatesDocument FOR RelatingDocument
    // HasDocumentReferences : SET [0:?] OF IfcDocumentReference FOR ReferencedDocument
    // IsPointedTo : SET [0:?] OF IfcDocumentInformationRelationship FOR RelatedDocuments
    // IsPointer : SET [0:1] OF IfcDocumentInformationRelationship FOR RelatingDocument
}
