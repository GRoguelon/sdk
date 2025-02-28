//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.7

// ignore_for_file: unused_import

import 'package:ory_client/model/identity_state.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'admin_update_identity_body.g.dart';

abstract class AdminUpdateIdentityBody implements Built<AdminUpdateIdentityBody, AdminUpdateIdentityBodyBuilder> {

    /// SchemaID is the ID of the JSON Schema to be used for validating the identity's traits. If set will update the Identity's SchemaID.
    @nullable
    @BuiltValueField(wireName: r'schema_id')
    String get schemaId;

    @BuiltValueField(wireName: r'state')
    IdentityState get state;
    // enum stateEnum {  active,  inactive,  };

    /// Traits represent an identity's traits. The identity is able to create, modify, and delete traits in a self-service manner. The input will always be validated against the JSON Schema defined in `schema_id`.
    @BuiltValueField(wireName: r'traits')
    JsonObject get traits;

    AdminUpdateIdentityBody._();

    static void _initializeBuilder(AdminUpdateIdentityBodyBuilder b) => b;

    factory AdminUpdateIdentityBody([void updates(AdminUpdateIdentityBodyBuilder b)]) = _$AdminUpdateIdentityBody;

    @BuiltValueSerializer(custom: true)
    static Serializer<AdminUpdateIdentityBody> get serializer => _$AdminUpdateIdentityBodySerializer();
}

class _$AdminUpdateIdentityBodySerializer implements StructuredSerializer<AdminUpdateIdentityBody> {

    @override
    final Iterable<Type> types = const [AdminUpdateIdentityBody, _$AdminUpdateIdentityBody];
    @override
    final String wireName = r'AdminUpdateIdentityBody';

    @override
    Iterable<Object> serialize(Serializers serializers, AdminUpdateIdentityBody object,
        {FullType specifiedType = FullType.unspecified}) {
        final result = <Object>[];
        if (object.schemaId != null) {
            result
                ..add(r'schema_id')
                ..add(serializers.serialize(object.schemaId,
                    specifiedType: const FullType(String)));
        }
        result
            ..add(r'state')
            ..add(serializers.serialize(object.state,
                specifiedType: const FullType(IdentityState)));
        result
            ..add(r'traits')
            ..add(serializers.serialize(object.traits,
                specifiedType: const FullType(JsonObject)));
        return result;
    }

    @override
    AdminUpdateIdentityBody deserialize(Serializers serializers, Iterable<Object> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = AdminUpdateIdentityBodyBuilder();

        final iterator = serialized.iterator;
        while (iterator.moveNext()) {
            final key = iterator.current as String;
            iterator.moveNext();
            final dynamic value = iterator.current;
            switch (key) {
                case r'schema_id':
                    result.schemaId = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
                case r'state':
                    result.state = serializers.deserialize(value,
                        specifiedType: const FullType(IdentityState)) as IdentityState;
                    break;
                case r'traits':
                    result.traits = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
            }
        }
        return result.build();
    }
}

