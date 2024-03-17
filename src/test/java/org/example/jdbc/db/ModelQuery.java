package org.example.jdbc.db;

import org.example.jdbc.db.fields.CompanyFields;
import org.example.jdbc.db.fields.ModelFields;
import org.example.jdbc.db.fields.QueryBuilder;
import org.example.jdbc.dto.CompanyDto;
import org.example.jdbc.dto.ModelDto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Class for actions in model db table.
 */
public class ModelQuery extends DefaultQuery implements ModelFields {

    public ModelDto getModelById(Long id)
            throws SQLException {
        ModelDto modelDto = null;
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(
                getModelByIdStringQuery(id));
        modelDto = getModelByResultSet(resultSet);
        return modelDto;
    }

    private String getModelByIdStringQuery(Long id) {
        QueryBuilder queryBuilder = getDefaultModelQuery()
                .where().modelId().equals().addElement(id);
        return queryBuilder.build();
    }

    public static ModelDto getModelByResultSet(ResultSet resultSet) throws SQLException {
        ModelDto modelDto = null;
        if (resultSet.getInt(MODEL_ID_FIELD) != 0) {
            modelDto = new ModelDto(
                    resultSet.getInt(MODEL_ID_FIELD),
                    resultSet.getString(MODEL_NAME_FIELD),
                    new CompanyQuery().getCompanyById(resultSet.getLong(COMPANY_FIELD)));
        }
        return modelDto;
    }

    private QueryBuilder getDefaultModelQuery() {
        return new QueryBuilder()
                .select()
                .all()
                .from()
                .modelTable();
    }
}
