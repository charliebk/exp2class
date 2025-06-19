' SELECT TYPE IfcDocumentSelect
' Options:
' - IfcDocumentInformation
' - IfcDocumentReference
Public Class IfcDocumentSelect
    Public ReadOnly Property Value As Object

    Public Sub New(value As Object)
        If Not (TypeOf value Is IfcDocumentInformation OrElse TypeOf value Is IfcDocumentReference) Then
            Throw New ArgumentException("Value must be one of: IfcDocumentInformation, IfcDocumentReference")
        End If
        Me.Value = value
    End Sub

    Public Function GetValueAs(Of T)() As T
        Return CType(Value, T)
    End Function
End Class
