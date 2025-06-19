package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public class IfcDocumentInformation extends IfcExternalInformation {

    public IfcIdentifier Identification;
    public IfcLabel Name;
    public IfcText Description; // OPTIONAL
    public IfcURIReference Location; // OPTIONAL
    public IfcText Purpose; // OPTIONAL
    public IfcText IntendedUse; // OPTIONAL
    public IfcText Scope; // OPTIONAL
    public IfcLabel Revision; // OPTIONAL
    public IfcActorSelect DocumentOwner; // OPTIONAL
    public IfcDateTime CreationTime; // OPTIONAL
    public IfcDateTime LastRevisionTime; // OPTIONAL
    public IfcIdentifier ElectronicFormat; // OPTIONAL
    public IfcDate ValidFrom; // OPTIONAL
    public IfcDate ValidUntil; // OPTIONAL
    public IfcDocumentConfidentialityEnum Confidentiality; // OPTIONAL
    public IfcDocumentStatusEnum Status; // OPTIONAL
    // INVERSE attributes:
    // DocumentInfoForObjects : SET [0:?] OF IfcRelAssociatesDocument FOR RelatingDocument;
    // HasDocumentReferences : SET [0:?] OF IfcDocumentReference FOR ReferencedDocument;
    // IsPointedTo : SET [0:?] OF IfcDocumentInformationRelationship FOR RelatedDocuments;
    // IsPointer : SET [0:1] OF IfcDocumentInformationRelationship FOR RelatingDocument;
}
