package com.customer.daoImpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.customer.dao.CustomerDao;
import com.customer.dao.FeedbackDao;
import com.customer.entity.Customers;
import com.customer.entity.Feedback;
import com.customer.util.HibernateUtil;

public class FeedbackDaoImpl implements FeedbackDao{
	CustomerDao customerDao = new CustomerDaoImpl();
	public Feedback createFeedback(Feedback feedback) {
		try(Session session=HibernateUtil.getSession()) {
		session.beginTransaction();
		// Customers customer = customerDao.getCustomerById(feedback.getCustomers().getCustomerID());
		 
		// feedback.setCustomers(customer);
		session.save(feedback);
		session.getTransaction().commit();
		return feedback;
		}
		catch(HibernateException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return null;
	}
	public List<Feedback>getAllFeedbacks(){
		try(Session session=HibernateUtil.getSession()) {
		return session.createQuery("FROM Feedback", Feedback.class).list();
		}
		catch(HibernateException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return null;
	}
	 public void updateFeedback(Feedback feedback) {
	        try (Session session = HibernateUtil.getSession()) {
	            session.beginTransaction();
	            session.update(feedback); // Update existing feedback
	            session.getTransaction().commit();
	        } catch (HibernateException e) {
	            System.out.println(e);
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	    }

	    public void deleteFeedback(Feedback feedback) {
	        try (Session session = HibernateUtil.getSession()) {
	            session.beginTransaction();
	            session.delete(feedback); // Delete the feedback
	            session.getTransaction().commit();
	        } catch (HibernateException e) {
	            System.out.println(e);
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	    }

	
	    public Feedback getFeedbackById(String feedbackId) {
	        try (Session session = HibernateUtil.getSession()) {
	            session.beginTransaction();
	            Feedback feedback = session.get(Feedback.class, feedbackId); // Get feedback by ID
	            session.getTransaction().commit();
	            return feedback;
	        } catch (HibernateException e) {
	            System.out.println(e);
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	        return null;
	    }
	    public List<Feedback> getFeedbacksByCustomerId(String customerID) {
	        try (Session session = HibernateUtil.getSession()) {
	            return session.createQuery("FROM Feedback WHERE customerID= :customerId", Feedback.class)
	                          .setParameter("customerId", customerID)
	                          .list();
	        } catch (HibernateException e) {
	            System.out.println(e);
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	        return null;
	    }
	    public Customers getCustomerById(String customerID) {
            try (Session session = HibernateUtil.getSession()) {
                session.beginTransaction();
                Customers customer = session.get(Customers.class, customerID); // Get customer by ID
                session.getTransaction().commit();
                return customer;
            } catch (HibernateException e) {
                System.out.println(e);
            } catch (Exception e) {
                System.out.println(e);
            }
            return null;
        }
	    
}
