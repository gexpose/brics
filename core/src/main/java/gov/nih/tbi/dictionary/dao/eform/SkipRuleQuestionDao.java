package gov.nih.tbi.dictionary.dao.eform;

import org.springframework.stereotype.Repository;

import gov.nih.tbi.commons.dao.GenericDao;
import gov.nih.tbi.dictionary.model.hibernate.eform.SkipRuleQuestion;

@Repository
public interface SkipRuleQuestionDao extends GenericDao<SkipRuleQuestion, Long> { 

}
